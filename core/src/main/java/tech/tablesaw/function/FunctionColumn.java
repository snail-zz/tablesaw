package tech.tablesaw.function;

import tech.tablesaw.columns.Column;

/**
 * 增加函数列，可在此列中定义excel函数，如:
 * 使用column name 方式
 * IF(col_userId="","",IF(TODAY()-60>col_openDate,60,col_openDate-col_closeDate))
 * <p>
 * 使用索引方式
 * IF(1="","",IF(TODAY()-60>2,60,2-3))
 * *
 * 所有函数执行必须要有返回，返回值作为此列的值。
 */
public interface FunctionColumn {
    /***
     * 增加函数
     * @param func 函数说明
     * @return Column列
     */
    Column addfunc(String func);
}
