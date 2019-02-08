1.tablesaw基础上增加列函数，可以以excel方式进行函数增加，如：
Double column =new DoubleColumn("num");
String funcExpr="IF(col_name="","",IF(TODAY()-60>col_s,0,10))";
Double resultColumn= column.addFunc(funExpr);

2.增加sql方言,可以select * from tableName where id='aa' group by id 进行查询
