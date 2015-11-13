package operations;

import java.util.ArrayList;
import java.util.Iterator;

import database.query.IdCountQuery;
import entity.IdCount;

public class IdCountOperations {
	IdCount idCount=new IdCount();
	IdCountQuery idCountQuery=new IdCountQuery();
	
	public String getUserIdCount(){
		ArrayList<IdCount> idCountList=idCountQuery.IdCountReterive(idCount);
		idCountQuery.IdCountDrop(idCount);
		Iterator<IdCount> it=idCountList.iterator();
		int maxIdCount=0;
		while(it.hasNext()){
			IdCount IdCountIt=it.next();
			if (maxIdCount<IdCountIt.getUserIdCount()){
				maxIdCount=IdCountIt.getUserIdCount();
				idCount=IdCountIt;
			}
		}
		maxIdCount++;
		idCount.setUserIdCount(maxIdCount);
		idCountQuery.IdCountInsert(idCount);
		String maxIdCountStr=Integer.toString(maxIdCount);
		while(maxIdCountStr.length()<=4)
			maxIdCountStr="0"+maxIdCountStr;
		return maxIdCountStr;
	}
	
	public String getCourseIdCount(){
		ArrayList<IdCount> idCountList=idCountQuery.IdCountReterive(idCount);
		idCountQuery.IdCountDrop(idCount);
		Iterator<IdCount> it=idCountList.iterator();
		int maxIdCount=0;
		while(it.hasNext()){
			IdCount IdCountIt=it.next();
			if (maxIdCount<IdCountIt.getCourseIdCount()){
				maxIdCount=IdCountIt.getCourseIdCount();
			    idCount=IdCountIt;
		     }
		}
		maxIdCount++;
		idCount.setCourseIdCount(maxIdCount);
		idCountQuery.IdCountInsert(idCount);
		String maxIdCountStr=Integer.toString(maxIdCount);
		while(maxIdCountStr.length()<=4)
			maxIdCountStr="0"+maxIdCountStr;
		return maxIdCountStr;
	}
	
	public String getExamIdCount(){
		ArrayList<IdCount> idCountList=idCountQuery.IdCountReterive(idCount);
		idCountQuery.IdCountDrop(idCount);
		Iterator<IdCount> it=idCountList.iterator();
		int maxIdCount=0;
		while(it.hasNext()){
			IdCount IdCountIt=it.next();
			if (maxIdCount<IdCountIt.getExamIdCount()){
				maxIdCount=IdCountIt.getExamIdCount();
				idCount=IdCountIt;
			}
		}
		maxIdCount++;
		idCount.setExamIdCount(maxIdCount);
		idCountQuery.IdCountInsert(idCount);
		String maxIdCountStr=Integer.toString(maxIdCount);
		while(maxIdCountStr.length()<=4)
			maxIdCountStr="0"+maxIdCountStr;
		return maxIdCountStr;
	}
	
	public String getQuestionIdCount(){
		ArrayList<IdCount> idCountList=idCountQuery.IdCountReterive(idCount);
		idCountQuery.IdCountDrop(idCount);
		Iterator<IdCount> it=idCountList.iterator();
		int maxIdCount=0;
		while(it.hasNext()){
			IdCount IdCountIt=it.next();
			if (maxIdCount<IdCountIt.getQuestionIdCount()){
				maxIdCount=IdCountIt.getQuestionIdCount();
				idCount=IdCountIt;
			}
		}
		maxIdCount++;
		idCount.setQuestionIdCount(maxIdCount);
		idCountQuery.IdCountInsert(idCount);
		String maxIdCountStr=Integer.toString(maxIdCount);
		while(maxIdCountStr.length()<=4)
			maxIdCountStr="0"+maxIdCountStr;
		return maxIdCountStr;
	}
	
	public String getTestIdCount(){
		ArrayList<IdCount> idCountList=idCountQuery.IdCountReterive(idCount);
		idCountQuery.IdCountDrop(idCount);
		Iterator<IdCount> it=idCountList.iterator();
		int maxIdCount=0;
		while(it.hasNext()){
			IdCount IdCountIt=it.next();
			if (maxIdCount<IdCountIt.getTestIdCount()){
				maxIdCount=IdCountIt.getTestIdCount();
				idCount=IdCountIt;
			}
		}
		maxIdCount++;
		idCount.setTestIdCount(maxIdCount);
		idCountQuery.IdCountInsert(idCount);
		String maxIdCountStr=Integer.toString(maxIdCount);
		while(maxIdCountStr.length()<=4)
			maxIdCountStr="0"+maxIdCountStr;
		return maxIdCountStr;
	}
	
	
}
