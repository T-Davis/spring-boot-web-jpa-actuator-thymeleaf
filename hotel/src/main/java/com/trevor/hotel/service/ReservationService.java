package com.trevor.hotel.service;

import com.trevor.hotel.domain.RoomReservation;
import com.trevor.hotel.entity.Room;
import com.trevor.hotel.repository.GuestRepository;
import com.trevor.hotel.repository.ReservationRepository;
import com.trevor.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tdavis on 7/8/17.
 */
@Service
public class ReservationService {
    private RoomRepository roomRepository;
    private GuestRepository guestRepository;
    private ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationsForDate(Date date) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
        rooms.forEach(room-> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getId());
        });
    }
}
