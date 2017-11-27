package PA165_language_school_manager.Facade;

import PA165.language_school_manager.DTO.LectureDTO;

import java.util.List;

public interface LectureFacade {

    LectureDTO findLectureById(Long id);
    List<LectureDTO> findAllLectures();
    LectureDTO findLectureByTopic(String topic);

}