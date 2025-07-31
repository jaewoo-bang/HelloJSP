select count(1) 
from tbl_board;

delete from tbl_board
where board_no > 100;

select *
from tbl_board
where writer like '%ȫ�浿%' or title like '%ȫ�浿%';


select ta.*
		from  (select /*+ INDEX_DESC(b PK_BOARD) */ rownum rn, b. *
		      from tbl_board b
		      <where>
		      <if test="searchCondition != null and searchCondition == 'T'.toString() ">
		      title like '%'||#{keyword}||'%'
		      </if>
		      <if test="searchCondition != null and searchCondition == 'w'.toString() ">
		      writer like '%'||#{keyword}||'%'
		      </if>
		      <if test="searchCondition != null and searchCondition == 'TW'.toString() ">
		      writer like '%'||#{keyword}||'%' or title like '%'||#{keyword}||'%'
		      </if>
		      </where>
		      ) ta
		where ta.rn > (#{page} - 1) * 5
		and   ta.rn <= #{page} * 5