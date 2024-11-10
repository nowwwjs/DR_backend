package com.dr.mapper.recipe;

import com.dr.dto.board.BoardReportDTO;
import com.dr.dto.recipe.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface RecipeMapper {
    // 나만의 레시피 목록 조회 (최신순)
    List<MyRecipeListDTO> selectAllPages();

    // 나만의 레시피 목록 조회 (추천순)
    List<MyRecipeListDTO> selectRecipesGood();

    //    챗봇레시피 목록 조회 (최신순)
    List<ChatBotRecipeListDTO> selectAllPages1();

    // 챗봇의 레시피 목록 조회 (추천순)
    List<ChatBotRecipeListDTO> selectAllPagesGood1();

    //    나만의레시피 상세페이지
    MyRecipeDetailDTO selectMyRecipeDetail(@Param("recipeNumber") Long recipeNumber);

    //    챗봇 레시피 상세페이지
    ChatBotRecipeDetailDTO selectChatBotRecipeDetail(@Param("recipeNumber") Long recipeNumber);

    //    나만의 레시피 댓글조회
    List<MyRecipeCommentDTO> selectMyRecipeComment(@Param("recipeNumber") Long recipeNumber);

    //    챗봇 레시피 댓글조회
    List<ChatBotRecipeCommentDTO> selectChatBotRecipeComment(@Param("recipeNumber") Long recipeNumber);

    // 나만의 레시피 댓글 작성
    void insertReply(MyRecipeCommentDTO myRecipeCommentDTO);

    // 챗봇 레시피 댓글 작성
    void insertChatBotReply(ChatBotRecipeCommentDTO chatBotRecipeCommentDTO);

    //나만의 레시피 댓글 수정
    void updateMyReply(MyRecipeCommentDTO myRecipeCommentDTO);

    //챗봇 레시피 댓글 수정
    void updateChatBotReply(ChatBotRecipeCommentDTO chatBotRecipeCommentDTO);

    //    나만의 레시피 댓글 삭제
    void deleteMyReply(Long replyNumber);

    // 챗봇 레시피 댓글 삭제
    void deleteChatBotReply(Long replyNumber);

    //    나만의 레시피 글쓰기
    // 레시피 데이터 삽입 메서드
    void insertMyRecipe(MyRecipeWriteDTO myRecipeWriteDTO);

//     사진 데이터 삽입 메서드
    void insertMyPhoto(RecipePhotoDTO recipePhotoDTO);

    //챗봇 레시피 글쓰기
    void insertChatBotRecipe(ChatBotRecipeWriteDTO chatBotRecipeWriteDTO);

    // 나만의 레시피 추천 수 증가
    void increaseGoodCount(MyRecipeGoodDTO myRecipeGoodDTO);

    // 챗봇 레시피 추천 수 증가
    void ChatBotincreaseGoodCount(ChatBotRecipeGoodDTO chatBotRecipeGoodDTO);

    // 나만의 레시피 추천 수 감소
    void decreaseGoodCount(MyRecipeGoodDTO myRecipeGoodDTO);

    // 챗봇 레시피 추천 수 감소
    void ChatBotdecreaseGoodCount(ChatBotRecipeGoodDTO chatBotRecipeGoodDTO);

    // 찜 추가 메서드
    void addSteam(RecipeSteamDTO recipeSteamDTO);

    // 찜 삭제 메서드
    void removeSteam(RecipeSteamDTO recipeSteamDTO);

    void report(RecipeReportDTO recipeReportDTO);


    // 레시피 삭제
    void deleteRecipe(Long recipeNumber);

    void deletePhoto(Long recipeNumber);

    // 레시피 수정
    void updateRecipe(MyRecipeUpdateDTO myRecipeUpdateDTO);

    void updatePhoto(MyRecipeUpdateDTO myRecipeUpdateDTO);

}

