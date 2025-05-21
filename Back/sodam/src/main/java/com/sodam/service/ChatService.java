package com.sodam.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sodam.entity.BlockedUser;
import com.sodam.entity.ChatMessage;
import com.sodam.entity.ChatRoom;
import com.sodam.entity.MuteList;
import com.sodam.repository.BlockedUserRepository;
import com.sodam.repository.ChatMessageRepository;
import com.sodam.repository.ChatRoomRepository;
import com.sodam.repository.MuteListRepository;

import lombok.RequiredArgsConstructor;

@Service
public class ChatService {
	
    private final ChatRoomRepository chatRoomRepository;
    private final ChatMessageRepository chatMessageRepository;
    private final BlockedUserRepository blockedUserRepository;
    private final MuteListRepository muteListRepository;

    public ChatRoom createChatRoom(Long userAId, Long userBId) {
        ChatRoom room = new ChatRoom();
        room.setUserAId(userAId);
        room.setUserBId(userBId);
        return chatRoomRepository.save(room);
    }

    public List<ChatRoom> getChatRoomsForUser(Long userId) {
        return chatRoomRepository.findByUserAIdOrUserBId(userId, userId);
    }

    public ChatMessage sendMessage(Long roomId, Long senderId, String message) {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setRoomId(roomId);
        chatMessage.setSenderId(senderId);
        chatMessage.setMessage(message);
        chatMessage.setSentAt(LocalDateTime.now());
        return chatMessageRepository.save(chatMessage);
    }

    public List<ChatMessage> getMessagesByRoom(Long roomId) {
        return chatMessageRepository.findByRoomIdOrderBySentAtAsc(roomId);
    }

    public void blockUser(Long blockerId, Long blockedUserId) {
        BlockedUser blockedUser = new BlockedUser(blockerId, blockedUserId);
        blockedUserRepository.save(blockedUser);
    }

    public void muteUser(Long muterId, Long mutedUserId) {
        MuteList muteList = new MuteList(muterId, mutedUserId);
        muteListRepository.save(muteList);
    }
}
