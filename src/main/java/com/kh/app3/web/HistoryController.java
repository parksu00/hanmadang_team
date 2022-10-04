package com.kh.app3.web;

import com.kh.app3.domain.member.svc.MemberSVC;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/history")
public class HistoryController {

  final MemberSVC memberSVC;

  // 내가 쓴 글 GET
  @GetMapping("/post")
  public String post(){

    return "member/history/history_post";
  }

  // 내가 쓴 댓글 GET
  @GetMapping("/comment")
  public String comment(){

    return "member/history/history_comment";
  }

  // 좋아요 목록 GET
  @GetMapping("/list")
  public String likelist(){

    return "member/history/history_list";
  }
}