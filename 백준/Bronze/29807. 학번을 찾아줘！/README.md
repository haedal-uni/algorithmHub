# [Bronze IV] 학번을 찾아줘! - 29807 

[문제 링크](https://www.acmicpc.net/problem/29807) 

### 성능 요약

메모리: 14192 KB, 시간: 104 ms

### 분류

수학, 구현, 사칙연산

### 제출 일자

2025년 6월 17일 17:53:52

### 문제 설명

<p>나는 7번의 수능 끝에 한양대학교 23학번으로 입학하게 된 김한양이다. 한양대학교 추가합격 전화를 받고 기뻐서 친구들과 술을 마시며 길을 걷다가 언덕 아래로 굴러 떨어지고 말았다. 깨어나보니 2주가 흘러 있었고, 수강신청까지는 15분밖에 남지 않았다. 수강신청 홈페이지에 들어갔지만 부상의 후유증으로 학번이 기억나지 않았다. 한양대학교 공지사항을 확인해보니 학번을 생성하는 방법에 대한 안내문이 있었다.</p>

<p>한양대학교는 Engine of Korea라고 불리는 만큼 학번을 만들 때 특수한 공식을 사용한다. 기본적으로 한양대학교 학번을 알아내기 위해서는 정확한 수능 점수(표준 점수)를 알고 있어야 한다. </p>

<ul>
	<li>국어 점수가 영어 점수보다 높다면, 두 점수의 차에 인문관의 건물 번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c35"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c38"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>508</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$508$</span></mjx-container>을 곱해준다. 	아니라면, 두 점수의 차에 국제관의 건물 번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c38"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>108</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$108$</span></mjx-container>을 곱해준다.</li>
	<li>수학 점수가 탐구 점수보다 높다면, 두 점수의 차에 제1공학관의 건물  번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c32"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>212</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$212$</span></mjx-container>를 곱해준다. 	아니라면, 두 점수의 차에 ITBT관의 건물 번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c33"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c35"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>305</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$305$</span></mjx-container>을 곱해준다.</li>
	<li>제2외국어를 응시했다면 제2외국어 점수에 행원파크 건물 번호인 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c37"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c37"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>707</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$707$</span></mjx-container>을 곱해준다.</li>
	<li>위에서 계산한 세 값을 더한 뒤, 한양대학교의 우편번호 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c34"></mjx-c><mjx-c class="mjx-c37"></mjx-c><mjx-c class="mjx-c36"></mjx-c><mjx-c class="mjx-c33"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mo class="mjx-n"><mjx-c class="mjx-c3D"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c34"></mjx-c><mjx-c class="mjx-c37"></mjx-c><mjx-c class="mjx-c36"></mjx-c><mjx-c class="mjx-c33"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>04763</mn><mo stretchy="false">(</mo><mo>=</mo><mn>4763</mn><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$04763 (= 4763)$</span></mjx-container>을 곱하면 학번이 나온다.</li>
</ul>

<p>위의 계산을 하려던 김한양은 머리를 다쳐서 암산이 안 된다는 것을 깨닫고 당신에게 학번을 계산해주는 프로그램을 만들어 달라고 부탁하였다. 김한양의 학번을 계산해줄 프로그램을 만들어라! 단, 앞의 과목을 응시하지 않으면 뒤의 과목을 응시할 수 없는 구조이며, 응시하지 않은 과목의 표준점수는 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0$</span></mjx-container>점이라고 가정하자.</p>

### 입력 

 <p>첫째 줄에 김한양이 응시한 과목 수를 나타내는 정수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D447 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D447 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c35"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>T</mi><mo stretchy="false">(</mo><mn>1</mn><mo>≤</mo><mi>T</mi><mo>≤</mo><mn>5</mn><mo stretchy="false">)</mo></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$T (1 \leq T \leq 5)$</span></mjx-container>가 주어진다. 둘째 줄에 각 과목의 표준점수를 나타내는 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D447 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>T</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$T$</span></mjx-container>개의 정수가 공백으로 구분되어 주어진다. 점수는 국어, 수학, 영어, 탐구, 제2외국어 순서로 주어지며, 탐구 과목의 점수는 두 과목의 표준점수의 합이 주어진다. 모든 과목의 점수는 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>0</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$0$</span></mjx-container> 이상 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>200</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$200$</span></mjx-container> 이하의 정수이다.</p>

### 출력 

 <p>김한양의 학번을 출력한다.</p>

