package kr.co.guide.admin.service.Impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.guide.admin.domain.Criteria;
import kr.co.guide.admin.domain.QnaDTO;
import kr.co.guide.admin.domain.QnaReplyDTO;
import kr.co.guide.admin.mapper.QnaMGMapper;
import kr.co.guide.admin.service.IQnaMGService;

@Service
public class QnaMGService implements IQnaMGService {
	
	@Autowired
	private QnaMGMapper mapper;
	
	private static final Logger log = LoggerFactory.getLogger(QnaMGService.class);

	@Override
	public List<QnaDTO> list(Criteria cri) throws Exception {
		log.info("QnaMGService......getListWithPaging..................");
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int totalCnt(Criteria cri) throws Exception {
		log.info("QnaMGService......getTotalCnt..................");
		return mapper.getTotalCnt(cri);
	}

	@Override
	public QnaDTO read(String qna_no) throws Exception {
		log.info("QnaMGService......detail..................");
		return mapper.read(qna_no);
	}

	@Override
	public List<QnaReplyDTO> readReply(String qna_no) throws Exception {
		return mapper.readReply(qna_no);
	}

}
