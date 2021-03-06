# 트리 구조

지금까지는 일렬로 연결된 형태였음. 1:1대응. 1자형.  
트리구조는 비선형 구조임. 일렬이 아님.

## 비선형구조
    하나의 자료 뒤에 여러개의 자료가 존재할 수 있는,  
    앞 뒤의 관계가 1:n 또는 n:m관계인 구조  

## 트리 vs 그래프
    순환이 가능한가? 불가능한가? 의 차이.  
    트리는 다시 돌아갈 수 없다.  
    사이클이 없는 하나의 연결 그래프 형태.  

## 트리 구조의 요소
1. 루트(뿌리)노드(root): 부모가 없는 노드. 트리에 단 하나 존재  
2. 단말(잎)노드(leaf): 자식이 없는 노드 / 또는 말단 노드  
3. 내부노드(internal): 단말 노드가 아닌 노드(중간 노드?)
4. 간선(edge): 노드를 연결하는 선, '가지'
5. 형제(sibling): 같은 부모노드를 가지는 노드들
6. 노드의 크기(size): 자신을 포함한 자손 노드의 개수(자손 <-> 조상
7. 노드의 깊이(depth): 루트에서 어떤 노드에 접근할 때 거쳐야 하는 간선의 수(뿌리~자신...인가?)
8. 노드의 레벨(level): 트리의 특정 깊이를 가지는 노드의 집합
9. 노드의 차수(degree): 간선 수(연결된 간선...인가? 부모의? or 자식의? or 둘다?)
10. 트리의 차수(maximum degree of tree): 트리의 최대 차수
11. 트리의 높이(height): 루트 노드에서 가장 깊숙히 있는 노드의 깊이(트리를 그렸을때 보이는 높이... 간선의 수로 계산)


## 트리의 특징
1. 계층 모델
2. DAG(Directed Acyclic Graphs): 방향성이 있는 비순환 그래프
3. 노드가 N개이면 간선의 수는 N-1개
4. 루트에서 어떤 노드로 가는 경로는 유일
5. 한개의 루트노드만 존재하며, 모든 자식노드는 하나의 부모노드를 가진다.
6. 이진트리, 이진탐색트리, 균형트리, 이진힙, ...

## 트리의 종류
1. 이진트리: 자식노드가 최대 두개인 노드들로 구성된 트리
   1. 완전이진트리: 트리의 모든 높이에서 노드가 꽉 차 있는 이진트리  
        마지막 레벨을 제외하고 모든레벨이 완전히 채워져 있다.
        굳이 마지막이 채워졌는지 아닌지 여부를 따지는 이유는?
   2. 전 이진트리
        모든 노드가 0개 또는 2개의 자식 노드를 갖는 트리
   3. 포화 이진트리
        완전 이진트리이면서 전 이진트리인 트리
        Qx. 마지막레벨은 안채워도 되나?
2. K진트리: 자식노드가 K개(최대...이겠지)인 노드들로 구성된 트리

[Reference](http://blog.naver.com/PostView.nhn?blogId=leeinje66&logNo=221622228795)
