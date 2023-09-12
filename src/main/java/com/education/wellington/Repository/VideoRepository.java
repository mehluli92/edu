package com.education.wellington.Repository;

import com.education.wellington.Entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
