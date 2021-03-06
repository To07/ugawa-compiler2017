解いた発展課題は次の通りです．
・（発展演習21）比較演算子（==，!=，>，<，>=，<=）の実装
・（発展演習22）論理演算子（&&，||，!）の実装
・（発展演習23）コンパイラのローカル変数の初期化
・（発展演習24）break文


以下で実装した機能１つ１つの仕様を説明します．

比較演算子（==, !=, >, <, >=, <=）
　これらは二項演算子として実装されています．==は，左辺と右辺の値が等しいときに1を返し，それ以外のときに0を返します．!=は，左辺と右辺の値が異なるときに1を返し，それ以外のときに0を返します．>は，左辺の値が右辺の値より大きいときに1を返し，それ以外のときに0を返します．<は，左辺の値が右辺の値より小さいときに1を返し，それ以外のときに0を返します．>=は，左辺の値が右辺の値以上のときに1を返し，それ以外のときに0を返します．<=は，左辺の値が右辺の値以下のときに1を返し，それ以外のときに0を返します．これらの演算子の優先順位は，C言語の仕様に合わせて，ビットAND演算子より高く，加算演算子より低くなっています．また，（==，!=）より（>，<，>=，<=）のほうが優先順位が高くなっています．
　作成したテストプログラムを，以下に示します．
・201.pi: 比較演算子(==)
・202.pi: 比較演算子(!=)
・203.pi: 比較演算子(>)
・204.pi: 比較演算子(<)
・205.pi: 比較演算子(>=)
・206.pi: 比較演算子(<=)

論理演算子（&&, ||, !）
　（&&，||）は二項演算子として実装されています．&&は，左辺と右辺の値を論理AND演算した結果が真のときに1を返し，偽のときに0を返します．||は，左辺と右辺の値を論理OR演算した結果が真のときに1を返し，偽のときに0を返します．これらの演算子の優先順位は，C言語の仕様に合わせて，ビットOR演算子より低くなっています．また，論理ORより論理ANDのほうが優先順位が高くなっています．
　また，（!）は単項演算子として実装されています．この演算は，オペランドの論理NOT演算をします．この演算子の優先順位は，C言語の仕様に合わせて，乗算演算子よりも高くなっています．また，他の単項演算子（-，~）と優先順位は変わりません．
・207.pi: 論理演算子(&&)
・208.pi: 論理演算子(||)
・209.pi: 論理演算子(!)

コンパイラのローカル変数の初期化
　コンパイラは，ローカル変数を値0で初期化します．その方法として，関数のプロローグ命令を書いた直後に，for文を用いて，その関数のすべてのローカル変数の番地に値0をストアします．
　作成したテストプログラムを，以下に示します．
・301.pi: ローカル変数の初期化

break文
　while文でbreak文が読まれると，その時点でwhile文の繰り返し処理が終了します．その後，while文の次の文が読まれます．また，多階層のwhile文の中でbreak文が読まれた場合は，そのbreak文がある階層のwhile文が終了します．ただし，while文の外でbreak文が読まれた場合はエラーを出力します．
　作成したテストプログラムを，以下に示します．
・302.pi: while-break文 その１
・303.pi: while-break文 その２
・304.pi: while-break文 その３

