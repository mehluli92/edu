package com.education.wellington.Controller;

import com.education.wellington.Entity.Board;
import com.education.wellington.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardController {
    @Autowired
    private BoardService boardService;

    @PostMapping("addBoard")
    public Board addBoard(@RequestBody Board board){
        return boardService.addBoard(board);
    }

    @GetMapping("showBoard/{id}")
    public Board getBoard(@PathVariable Long id){
        return boardService.viewBoard(id);
    }

    @PutMapping("upadateBoard")
    public Board updateBoard(@RequestBody Board board){
        return boardService.editBoard(board);
    }

    @DeleteMapping("deleteBoard/{id}")
    public String deleteBoard(@PathVariable Long id){
        return boardService.deleteBoard(id);
    }

}
