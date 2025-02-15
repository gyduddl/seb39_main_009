package teamparkinglot.parkinggo.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teamparkinglot.parkinggo.member.dto.MemberJoinDto;
import teamparkinglot.parkinggo.member.dto.MemberLoginDto;
import teamparkinglot.parkinggo.member.entity.Member;
import teamparkinglot.parkinggo.member.mapper.MemberMapper;
import teamparkinglot.parkinggo.member.repository.MemberRepository;
import teamparkinglot.parkinggo.member.service.MemberService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final MemberMapper mapper;

    @PostMapping("/join")
    public ResponseEntity joinUser(@RequestBody MemberJoinDto memberJoinDto) {

        Member member = mapper.memberJoinDtoToMember(memberJoinDto);
        memberService.memberCreate(member);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody MemberLoginDto memberLoginDto) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
