// 추천 이미지 클릭 이벤트 추가
document.addEventListener("DOMContentLoaded", function () {
    const recommendImg = document.getElementById("recommendImg");
    const recipeNumber = document.getElementById("recipeNumber").value;

    let isActive = localStorage.getItem(`recommend-active-${recipeNumber}`) === 'true';
    recommendImg.classList.toggle("recommend-active", isActive);
    recommendImg.classList.toggle("recommend-inactive", !isActive);

    let isRequestInProgress = false;

    const handleClick = function () {
        if (isRequestInProgress) return;

        isRequestInProgress = true;
        const url = isActive ? "/recipe/goodMinus" : "/recipe/goodPlus";

        fetch(url, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ recipeNumber: recipeNumber })
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error("요청 실패: " + response.statusText);
                }

                // 추천 상태 업데이트 및 localStorage 저장
                isActive = !isActive;
                recommendImg.classList.toggle("recommend-active", isActive);
                recommendImg.classList.toggle("recommend-inactive", !isActive);
                localStorage.setItem(`recommend-active-${recipeNumber}`, isActive);

                // 요청 성공 시 페이지 새로 고침
                location.reload();
            })
            .catch(error => {
                console.error("Error:", error);
                alert("요청 처리 중 오류가 발생했습니다.");
            })
            .finally(() => {
                isRequestInProgress = false;
            });
    };

    recommendImg.addEventListener("click", handleClick);
});

// 댓글 등록 버튼 클릭 시
function submitComment() {
    const confirmation = confirm("댓글을 등록하시겠습니까?");
    if (!confirmation) return;
    alert("댓글이 등록되었습니다.");
}

// 댓글 수정 버튼을 눌렀을 때 실행되는 함수
document.querySelectorAll('.myDetailPage-editBtn').forEach(function (button)  {
    button.addEventListener('click',function ()  {
        let commentContainer = button.closest('.myDetailPage-comment');
        let commentText = commentContainer.querySelector('.myDetailPage-commentText');
        let editInput = commentContainer.querySelector('.myDetailPage-commentInput');
        let editTextarea = editInput.querySelector('textarea');
        let buttonGroup = commentContainer.querySelector('.myDetailPage-buttonGroup');

        commentText.setAttribute('data-original-text', commentText.innerText);
        editTextarea.value = commentText.innerText;

        commentText.style.display = 'none';
        buttonGroup.style.display = 'none';
        editInput.style.display = 'block';
    });
});

// 댓글 수정 취소 버튼을 눌렀을 때 실행되는 함수
document.querySelectorAll('.myDetailPage-cancelBtn').forEach(function (button)  {
    button.addEventListener('click', function ()  {
        let recipeNumber = document.querySelector('[name="recipeNumber"]').value;
        window.location.href = '/recipe/myDetailPage?recipeNumber=' + recipeNumber;
    });
});

// 댓글 저장 버튼을 눌렀을 때 실행되는 함수
document.querySelectorAll('.myDetailPage-saveBtn').forEach(function (button) {
    button.addEventListener('click', function ()  {
        let commentContainer = button.closest('.myDetailPage-comment');
        let replyNumber = commentContainer.querySelector('input[name="replyNumber"]').value;
        let editTextarea = commentContainer.querySelector('textarea').value;

        console.log(commentContainer);
        console.log(replyNumber);
        console.log(editTextarea);
        if (confirm("수정하시겠습니까?")) {
            $.ajax({
                type: 'POST',
                url: '/recipe/updateMyReply',
                data: {
                    replyNumber: replyNumber,
                    replyText: editTextarea
                },

                success: function ()  {
                    alert("댓글 수정이 완료되었습니다.");
                    window.location.reload();
                },
                error: function ()  {
                    alert("댓글 수정에 실패했습니다.");
                }
            });
        }
    });
});

// 댓글 삭제 버튼을 눌렀을 때 실행되는 함수
document.querySelectorAll('.myDetailPage-deleteBtn').forEach(function (button)  {
    button.addEventListener('click', function ()  {
        let replyNumber = button.getAttribute('data-reply-number');
        deleteComment(replyNumber);
    });
});

// 댓글 삭제 함수
function deleteComment(replyNumber) {
    if (confirm("정말로 이 댓글을 삭제하시겠습니까?")) {
        $.ajax({
            type: 'POST',
            url: '/recipe/deleteMyReply',
            data: { replyNumber: replyNumber },
            success: function ()  {
                alert("댓글이 삭제되었습니다.");
                //페이지를 새로고침하여 변경 사항 반영
                window.location.reload();
            },
            error: function ()  {
                alert("댓글 삭제에 실패했습니다.");
            }
        });
    }
}
