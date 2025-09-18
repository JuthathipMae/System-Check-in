#include <Wire.h>
#include <Adafruit_PN532.h>

#define SDA_PIN D5
#define SCL_PIN D6
#define BUZZER_PIN D8

Adafruit_PN532 nfc(5, 4); // SDA, SCL

void setup() {
  Serial.begin(115200);
  pinMode(BUZZER_PIN, OUTPUT);
  Wire.begin(D5, D6);
  nfc.begin();
  
  uint32_t versiondata = nfc.getFirmwareVersion();
  if (!versiondata) {
    Serial.println("ไม่พบ PN532");
    while (1) yield();
  }
  
  nfc.SAMConfig(); // เริ่มโหมด NFC
  Serial.println("พร้อมอ่านบัตร NFC...");
}

void loop() {
  uint8_t uid[7];       // buffer สำหรับ UID
  uint8_t uidLength;

  // ตรวจสอบว่ามีบัตรอยู่ในระยะอ่านหรือไม่
  if (nfc.readPassiveTargetID(PN532_MIFARE_ISO14443A, uid, &uidLength)) {
    String uidStr = "";
    for (uint8_t i = 0; i < uidLength; i++) {
      if (uid[i] < 0x10) uidStr += "0"; // เติม 0 ข้างหน้าเลขตัวเดียว
      uidStr += String(uid[i], HEX);
         // แปลงเป็นเลขฐาน 16
    }
    beepShort(2); 
    uidStr.toUpperCase();                // แปลงเป็นตัวใหญ่
    Serial.println(uidStr);              // ส่ง UID ไป Java หรือ Serial Monitor
    delay(1000);                         // หน่วง 1 วินาที
  }
}
void beep(int duration) {
  digitalWrite(BUZZER_PIN, HIGH);
  delay(duration);
  digitalWrite(BUZZER_PIN, LOW);
}
void beepShort(int times) {
  for (int i = 0; i < times; i++) {
    beep(100);
    delay(150);
  }
}
