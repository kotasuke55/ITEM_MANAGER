package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ItemForm;

@Controller
@RequestMapping("/item")
public class ItemController {

	@GetMapping
	public String index() {
		return "/item/index";
	}

	@GetMapping("toroku")
    public String torokuPage(@ModelAttribute("itemForm") ItemForm itemForm) {
        // 処理を追加
        return "item/torokuPage";
    }

	@PostMapping("toroku")
	public String toroku(ItemForm itemForm) {
		// 処理を追加
		return "redirect:/item";
	}

	@GetMapping("henshu/{id}")
	public String henshuPage(@PathVariable Integer id, @ModelAttribute("ItemForm") ItemForm itemForm) {
		// 処理を追加
		return "item/henshuPage";
	}

	@PostMapping("henshu/{id}")
	public String henshu(@PathVariable Integer id, @ModelAttribute("ItemForm") ItemForm itemForm) {
		// 処理を追加
		return "redirect:item";
	}

	@PostMapping("sakujo/{id}")
	public String sakufo(@PathVariable Integer id) {
		// 処理を追加
		return "redirect:item";
	}
}
