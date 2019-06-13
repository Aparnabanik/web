package com.example.demo.service;

import com.example.demo.model.Room;
import com.example.demo.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomRepository roomRepository;
    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
    @Override
    public Room getRoomById(String roomNo) {
        return roomRepository.getOne(roomNo);
    }
    @Override
    public void saveOrUpdate(Room room) {
        roomRepository.save(room);
    }
    @Override
    public void removeRoom(String roomNo) {
        roomRepository.deleteById(roomNo);
    }
}