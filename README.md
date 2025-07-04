# 📱 Sodam  
"데이터 없이도 블루투스로 채팅하고, 게임하고, 리워드까지 누리는 전통 감성 커뮤니케이션 앱"

---

## ✨ 프로젝트 소개  
같은 공간에 있는 사용자들이 블루투스를 통해 실시간 채팅과 게임을 즐기고,  
게임을 통해 리워드를 얻어 상점에서 아이템을 구매할 수 있는 로컬 통신 기반 앱입니다.
※ 현재 블루투스 기반 통신은 **기초 구현만 완료된 상태이며**,  
게임은 단일 기기 내에서는 작동하지만 **기기 간 멀티플레이 연결은 미완성**입니다.

---

## 🛠 사용 기술 (Tech Stack)  
- **Frontend**: Flutter  
- **Backend**: Spring Boot, Java 17, Lombok  
- **Database**: PostgreSQL  
- **Local Storage**: SharedPreferences  

---

## 👥 팀원 소개  

| 이름     | 역할           | 담당 기능 |
|----------|----------------|-----------|
| 이하늘 | 팀장 / 백엔드 | 회원 관리, 리워드 지급, 블루투스 통신 로직 |
| 김제현 | 백엔드        | DB 설계, 관리자 기능, 게임 결과 저장 |
| 최한솔 | 프론트엔드    | 인트로/온보딩, 로그인/회원가입/비회원, 채팅화면, 방 만들기, 게임 UI, 리워드 시스템 |
| 김기찬 | 프론트엔드    | 상점 구현, 테마/이모티콘 구매 기능, 다크모드, 출석 체크, 뱃지 시스템, 마이페이지 |
| 정웅태 | 프론트엔드    | 게임 UI |

---

## 🔥 주요 기능  
- 회원가입 / 로그인 / 비회원 접속  
- 아이디 찾기 / 비밀번호 재설정  
- 채팅리스트, 채팅방 생성 및 입장
- 전통 게임 (가위바위보 / 팽이치기 / 비석치기 / 남승도 게임)  
- 게임 승리 시 엽전 리워드 지급  
- 마이페이지 (출석 체크 / 엽전 보유량 / 리워드 이력 확인)  
- 리워드 상점 (테마 / 이모티콘 구매)  
- 다크모드 (리워드로 구매 시 사용 가능)  
- 뱃지 시스템 (출석 등 기준 충족 시 부여)  
- 특정 사용자 차단 기능  

---

## 📌 개발 환경  
- Android Studio (2024.3.2.14)  
- Flutter (3.29.3)  
- Spring Tools Suite 4 (4.20.0)  
- PostgreSQL (17.5)  
- DBeaver (25.0.5)

---

## 📎 Notion 문서  
[소담 프로젝트 노션 문서](https://www.notion.so/1fb6378975b180eda00adf4eb1e881f4?source=copy_link)
