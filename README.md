# QnA-project
## 2021 ~ 2022 창업 동아리 
### 2021년도 2학기에 구현했던 ExchangeDiary-project의 기능을 수정, 보완하여 안드로이드 앱으로 구현

연관 repository  
https://github.com/Park-EunBi/ExchangeDiary-project.git
---

### 프로젝트 주제 
QnA를 기반으로 하는 안드로이드 sns 서비스  

### 프로젝트 소개 
* 질의응답을 기반으로 하는 안드로이드 sns 서비스 
* 복잡한 sns 기능에 피로를 느낀 사용자들을 대상으로 서비스 제작
    * sns의 핵심 기능을 담기위해 노력함
* 사용자는 하루 한 번 업로드되는 질문에 답변을 올릴 수 있음
* 다른 사용자들과 답변을 공유하며 여러 사람들과 소통 할 수 있음 

### 주요 기능 
1. 메인 페이지  
   * 교환일기의 다른 페이지들로 이동할 수 있도록 구현
  
2. 로그인 페이지   
   * 로그인과 회원가입을 할 수 있는 공간  
   * 교환일기 웹 페이지 접속 시 가장 먼저 마주하는 공간 
   * firebase 사용 

3. 오픈 룸 
    * 교환일기 웹 서비스에 로그인 한 사람 모두가 이용할 수 있는 공간
    * 하루 한번 올라오는 질문에 단 한 번 답변을 업로드 할 수 있음
    - 사용자의 피로감을 줄이기 위해 답변 횟수를 하루 1회로 제한
    - 글, 사진, 음성, 영상 중 한 가지를 선택하여 업로드  
    * 자신의 답변을 공유하여 다른 사용자들과 소통할 수 있음 
    * 해당 날짜가 지나면 답변을 업로드 할 수 없음 (읽기만 가능)
    * 익명으로 사용자들이 편안하게 소통할 수 있음 
    * 다른 사용자가 남긴 답변에 답변으로 소통할 수 있음 

4. 시크릿 룸
    * 방의 이름과 비밀번호를 아는 사람만 이용할 수 있는 공간
    * 오픈 룸의 주요 기능을 동일하게 사용할 수 있음 
    - 자유롭게 질문을 올리고 답변을 할 수 있는 공간 

5. 프로필 페이지 
    * 사용자의 프로필 설정 가능 
    -  사진 업로드, 해시태그로 자신을 표현 
    -  스티커로 사용자의 프로필을 꾸밀 수 있음 
    * 닉네임 변경 기능 
    * 스크랩 한 답변을 볼 수 있음
    * 계정, 앱 설정이 가능
---

📦 QnA-project (2021년)  
┣ 📂 main-page    
┣ 📂 login    
┣ 📂 open_room  
┣ 📂 secret_room  
┣ 📂 select-room  
┗ 📂 profile  

---
### collaborators
박은비 (팀장)   
https://github.com/Park-EunBi    

이소영     
https://github.com/jordan-comlinee  

이수진  
https://github.com/Soojin-Lee-01    

  
