package com.sodam.dto;

import lombok.Data;

public class ChatRequest {

    @Data
    public static class CreateRoom {
        private Long userAId;
        private Long userBId;
    }

    @Data
    public static class SendMessage {
        private Long roomId;
        private Long senderId;
        private String message;
    }

    @Data
    public static class BlockUser {
        private Long blockerId;
        private Long blockedUserId;
    }

    @Data
    public static class MuteUser {
        private Long muterId;
        private Long mutedUserId;
    }
}
