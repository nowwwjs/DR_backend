package com.dr.controller.recipe;

import com.dr.dto.recipe.ChatBotRecipeListDTO;
import com.dr.dto.recipe.MyRecipeDetailDTO;
import com.dr.dto.recipe.MyRecipeListDTO;
import com.dr.service.recipe.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/recipe")
@RequiredArgsConstructor
@Slf4j
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping("/myRecipeList")
    public String MyRecipeList(Model model) {
        // 전체 레시피 목록 조회
        List<MyRecipeListDTO> recipeList = recipeService.findAllRecipes();

        // 모델에 레시피 목록 추가
        model.addAttribute("recipeList", recipeList);

        return "recipe/myRecipeList";  // myRecipeList.html로 데이터 전달
    }

    @GetMapping("/chatBotRecipeList")
    public String chatBotRecipeList(Model model) {
        // 전체 레시피 목록 조회
        List<ChatBotRecipeListDTO> recipeList = recipeService.findAllRecipes1();

        // 모델에 레시피 목록 추가
        model.addAttribute("recipeList", recipeList);

        return "recipe/chatBotRecipeList";  // chatBotRecipeList.html로 데이터 전달
    }

    @GetMapping("/myDetailPage")
    public String myDetailPage(@RequestParam("recipeNumber") Long recipeNumber, Model model) {
        // 특정 레시피의 상세 정보 조회
        MyRecipeDetailDTO recipeDetail = recipeService.findMyRecipeDetail(recipeNumber);

        // 모델에 레시피 상세 정보 추가
        model.addAttribute("recipeDetail", recipeDetail);

        return "recipe/myDetailPage";  // myDetailPage.html로 데이터 전달
    }
}
