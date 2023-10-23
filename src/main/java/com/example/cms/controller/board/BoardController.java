//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.cms.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    public BoardController() {
    }

    @GetMapping({"/board"})
    public String board() {
        return "board/board";
    }

    @GetMapping({"/boardContents"})
    public String boardContents() {
        return "board/boardContents";
    }

    @GetMapping({"/boardCreate"})
    public String boardCreate() {
        return "board/boardCreate";
    }

    @GetMapping({"/boardDelete"})
    public String boardDelete() {
        return "board/boardDelete";
    }

    @GetMapping({"/boardUpdate"})
    public String boardUpdate() {
        return "board/boardUpdate";
    }
}
