解いた発展課題は次の通りです．
・（発展演習14）比較演算子（==，!=，>，<，>=，<=）の実装
・（発展演習15）論理演算子（&&，||，!）の実装


以下で実装した機能１つ１つの仕様を説明します．

比較演算子（==, !=, >, <, >=, <=）
　これらは二項演算子として実装されています．==は，左辺と右辺の値が等しいときに1を返し，それ以外のときに0を返します．!=は，左辺と右辺の値が異なるときに1を返し，それ以外のときに0を返します．>は，左辺の値が右辺の値より大きいときに1を返し，それ以外のときに0を返します．<は，左辺の値が右辺の値より小さいときに1を返し，それ以外のときに0を返します．>=は，左辺の値が右辺の値以上のときに1を返し，それ以外のときに0を返します．<=は，左辺の値が右辺の値以下のときに1を返し，それ以外のときに0を返します．これらの演算子の優先順位は，C言語の仕様に合わせて，ビットAND演算子より高く，加算演算子より低くなっています．また，（==，!=）より（>，<，>=，<=）のほうが優先順位が高くなっています．
　作成したテストプログラムを，以下に示します．
・501.pis: 比較演算子(==)
・502.pis: 比較演算子(!=)
・503.pis: 比較演算子(>)
・504.pis: 比較演算子(<)
・505.pis: 比較演算子(>=)
・506.pis: 比較演算子(<=)

論理演算子（&&, ||, !）
　（&&，||）は二項演算子として実装されています．&&は，左辺と右辺の値を論理AND演算した結果が真のときに1を返し，偽のときに0を返します．||は，左辺と右辺の値を論理OR演算した結果が真のときに1を返し，偽のときに0を返します．これらの演算子の優先順位は，C言語の仕様に合わせて，ビットOR演算子より低くなっています．また，論理ORより論理ANDのほうが優先順位が高くなっています．
　また，（!）は単項演算子として実装されています．この演算は，オペランドの論理NOT演算をします．この演算子の優先順位は，C言語の仕様に合わせて，乗算演算子よりも高くなっています．また，他の単項演算子（-，~）と優先順位は変わりません．
　テストファイルは作成したテストプログラムを，以下に示します．
・507.pis: 論理演算子(&&)
・508.pis: 論理演算子(||)
・509.pis: 論理演算子(!)
