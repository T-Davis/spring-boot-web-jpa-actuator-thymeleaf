package com.trevor.hotel.repository;

import com.trevor.hotel.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tdavis on 7/8/17.
 */
@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {
}
