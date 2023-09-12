package com.education.wellington.Service;

import com.education.wellington.Entity.Board;
import com.education.wellington.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public Board addBoard(Board board){
        return boardRepository.save(board);
    }

    public List<Board> viewBoards(){
        return boardRepository.findAll();
    }

    public Board viewBoard(Long id){
        return boardRepository.findById(id).orElse(null);
    }

    public Board editBoard(Board board){
        Board currentBoard = boardRepository.findById(board.getId()).orElse(null);
        return boardRepository.save(board);
    }

    public String deleteBoard(Long id){
      Board currentBoard = boardRepository.findById(id).orElse(null);
      if(currentBoard == null){
          return "Record does not exist";
      }
      String name = currentBoard.getExam_board();
      boardRepository.deleteById(id);
      return name + " deleted with success";
    }
}
