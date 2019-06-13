package com.example.demo.service;

import com.example.demo.model.Room;

import java.util.List;

public interface RoomService {
    public List<Room> getAllRooms();
    public Room getRoomById(String roomNo);
    public void saveOrUpdate(Room room);
    public void removeRoom(String roomNo);
}
