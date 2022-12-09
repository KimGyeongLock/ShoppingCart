package com.example;

import com.example.bean.ShoppingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

    @Autowired
    ShoppingServiceImpl shoppingService;

    @RequestMapping("/")
    public String home() { return "index"; }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String shoppinglist(Model model) {
        model.addAttribute("list", shoppingService.getCartList());
        return "shopping/posts";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost() {
        return "shopping/addpostform";
    }

    @RequestMapping(value = "/addok", method = RequestMethod.POST)
    public String addPostOK(ShoppingVO vo) {
        int i = shoppingService.insertCart(vo);
        if (i == 0)
            System.out.println("데이터 추가 실패 ");
        else
            System.out.println("데이터 추가 성공!!!");
        return "redirect:list";
    }

//    @RequestMapping(value = "/viewpost/{id}", method = RequestMethod.GET)
//    public String viewPost(@PathVariable("id") int id, Model model) {
//        System.out.println("View post");
//        ShoppingVO shoppingVO = shoppingService.getCart(id);
//        model.addAttribute("boardVO", shoppingVO);
//        return "board/view";
//    }

    @RequestMapping(value = "/editpost/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model) {
        System.out.println("Edit post");
        ShoppingVO shoppingVO = shoppingService.getCart(id);
        model.addAttribute("shoppingVO", shoppingVO);
        return "shopping/editform";
    }

    @RequestMapping(value = "/editok", method = RequestMethod.POST)
    public String editPostOK(ShoppingVO vo) {
        int i = shoppingService.updateCart(vo);
        if (i == 0)
            System.out.println("데이터 수정 실패 ");
        else
            System.out.println("데이터 수정 성공!!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
    public String deletePostOk(@PathVariable("id") int id) {
        int i = shoppingService.deleteCart(id);
        if(i == 0)
            System.out.println("데이터 삭제 실패 ");
        else
            System.out.println("데이터 삭제 성공!!!");
        return "redirect:../list";
    }

}
