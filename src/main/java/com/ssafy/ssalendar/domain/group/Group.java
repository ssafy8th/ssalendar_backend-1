package com.ssafy.ssalendar.domain.group;

import com.ssafy.ssalendar.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


enum Authority{
    마스터, 관리, 보기
}

enum GroupParticipationStatus{
    마스터, 수락, 거절, 대기
}
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "group_def")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long defNo;

    // 캘린더 매핑
    private Long calendarNo;

    // 유저 매핑
    @OneToMany(mappedBy = "user")
    private User user;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Enumerated(EnumType.STRING)
    private GroupParticipationStatus groupParticipationStatus;

}
