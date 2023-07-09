package Practice_07;




public class C20230707 {
	public static void main(String[] args) {

		//의문점		: X
		//정리 : Java Script 복습, 프로젝트 복습

//			
//		
		//예제 1
		 
//		<style>
//		.skillContainer {
//		  display: flex;
//		}
//
//		.skillBox {
//		  width: 100px;
//		  height: 100px;
//		  display: flex;
//		  align-items: center;
//		  justify-content: center;
//		  font-size: 24px;
//		  font-weight: bold;
//		}
//
//		#skillQBox {
//		  background-color: yellow;
//		}
//
//		#skillWBox {
//		  background-color: green;
//		}
//
//		#skillEBox {
//		  background-color: purple;
//		}
//
//		#skillRBox {
//		  background-color: red;
//		}
//		</style>
//
//		<div class="skillContainer">
//		  <div id="skillQBox" class="skillBox"></div>
//		  <div id="skillWBox" class="skillBox"></div>
//		  <div id="skillEBox" class="skillBox"></div>
//		  <div id="skillRBox" class="skillBox"></div>
//		</div>
//
//		    <script>
//		    const TEEMO = {
//		        name : "티모",
//		        line : "JNGGLE",
//		        passiveskill : "투명",
//		        skillQ : "독침",
//		        skillW : "우사인볼트",
//		        skillE : "도트데미지", 
//		        skillR : "지옥",
//		        
//		        skillEExplanation : function(){
//		            alert(this.name + "의 독이 100초간 매초(AP0.01)데미지를 줍니다.");
//		        },
//		        skillQExplanation : function(){
//		            alert(this.name + "의 " + this.skillQ + "이 500의 데미지를 입히고 100초동안 실명");
//		        },
//		        skillWExplanation : function(){
//		            alert(this.name + "스피드 = " + this.skillW);
//		        },
//		        skillRExplanation : function(){
//		            alert(this.name + "버섯을 밟으면 " + this.skillR + "행");
//		        }
//		    }
//		    document.getElementById("skillQBox").addEventListener("click", TEEMO.skillQExplanation.bind(TEEMO));
//		    document.getElementById("skillWBox").addEventListener("click", TEEMO.skillWExplanation.bind(TEEMO));
//		    document.getElementById("skillEBox").addEventListener("click", TEEMO.skillEExplanation.bind(TEEMO));
//		    document.getElementById("skillRBox").addEventListener("click", TEEMO.skillRExplanation.bind(TEEMO));
//
//
//		    </script>
//
//		
//		
//		예제2
//		replyButton = new JButton("답변하기");
//        replyButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String selectedQuestion = questionList.getSelectedValue();
//                if (selectedQuestion != null) {
//                    String answer = JOptionPane.showInputDialog(QnaBoard.this, "질문에 대한 답변을 입력하세요:");
//                    if (answer != null && !answer.isEmpty()) {
//                        answerTextArea.setText("질문: " + selectedQuestion + "\n답변: " + answer);
//                    }
//                }
//            }
//        });
//			-> List에서 선택된 질문 가져옴
//			-> JavaSwing기능 버튼 클릭하면 답
//			-> 선택된 질문이 존재할때 JOptionPane을 통해 답변 입력가능
//			
////		
	}
}
