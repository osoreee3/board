package com.ll.basic1.Answer;


import com.ll.basic1.Question.Question;
import com.ll.basic1.Question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/answer")
@Controller
@RequiredArgsConstructor
public class AnswerController {
    private final QuestionService questionService;
    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam String content) {
        Question question = this.questionService.getQuestion(id);
        this.answerService.create(question,content);

         // TODO : 답변을 저장한다.
        return String.format("redirect:/question/detail/%s", id);
    }
    @GetMapping("/create")
    public String questionCreate(){
        return "question_form";
    }


}
