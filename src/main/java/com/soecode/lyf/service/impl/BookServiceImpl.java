/*package com.soecode.lyf.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soecode.lyf.dao.AppointmentDao;
import com.soecode.lyf.dao.BookDao;
import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.entity.Appointment;
import com.soecode.lyf.entity.Book;
import com.soecode.lyf.enums.AppointStateEnum;
import com.soecode.lyf.exception.AppointException;
import com.soecode.lyf.exception.NoNumberException;
import com.soecode.lyf.exception.RepeatAppointException;
import com.soecode.lyf.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 娉ㄥ叆Service渚濊禆
	@Autowired
	private BookDao bookDao;

	@Autowired
	private AppointmentDao appointmentDao;


	@Override
	public Book getById(long bookId) {
		return bookDao.queryById(bookId);
	}

	@Override
	public List<Book> getList() {
		return bookDao.queryAll(0, 1000);
	}

	@Override
	@Transactional
	*//**
	 * 浣跨敤娉ㄨВ鎺у埗浜嬪姟鏂规硶鐨勪紭鐐癸細 1.寮�彂鍥㈤槦杈炬垚涓�嚧绾﹀畾锛屾槑纭爣娉ㄤ簨鍔℃柟娉曠殑缂栫▼椋庢牸
	 * 2.淇濊瘉浜嬪姟鏂规硶鐨勬墽琛屾椂闂村敖鍙兘鐭紝涓嶈绌挎彃鍏朵粬缃戠粶鎿嶄綔锛孯PC/HTTP璇锋眰鎴栬�鍓ョ鍒颁簨鍔℃柟娉曞閮�	 * 3.涓嶆槸鎵�湁鐨勬柟娉曢兘闇�浜嬪姟锛屽鍙湁涓�潯淇敼鎿嶄綔锛屽彧璇绘搷浣滀笉闇�浜嬪姟鎺у埗
	 *//*
	public AppointExecution appoint(long bookId, long studentId) {
		try {
			// 鍑忓簱瀛�			int update = bookDao.reduceNumber(bookId);
			if (update <= 0) {// 搴撳瓨涓嶈冻
				throw new NoNumberException("no number");
			} else {
				// 鎵ц棰勭害鎿嶄綔
				int insert = appointmentDao.insertAppointment(bookId, studentId);
				if (insert <= 0) {// 閲嶅棰勭害
					throw new RepeatAppointException("repeat appoint");
				} else {// 棰勭害鎴愬姛
					Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
					return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
				}
			}
		} catch (NoNumberException e1) {
			throw e1;
		} catch (RepeatAppointException e2) {
			throw e2;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			// 鎵�湁缂栬瘧鏈熷紓甯歌浆鎹负杩愯鏈熷紓甯�			throw new AppointException("appoint inner error:" + e.getMessage());
		}
	}

}
*/