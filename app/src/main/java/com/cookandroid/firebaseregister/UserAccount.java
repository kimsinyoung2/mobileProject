package com.cookandroid.firebaseregister;


    // 객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 막는데, 이를 해결하기 위해 메소드를 사용한다.
public class UserAccount{
        private String idToken;
        private String emailId;
        private String password;

        public UserAccount() {
            // Default constructor required for Firebase Realtime Database
        }

        public String getIdToken() {
            return idToken;
        }

        public void setIdToken(String idToken) {
            this.idToken = idToken;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

}