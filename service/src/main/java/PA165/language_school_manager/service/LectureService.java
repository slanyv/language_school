package PA165.language_school_manager.service;

import PA165.language_school_manager.Entities.Lecture;

import java.util.List;

public interface LectureService {

    /**
     * Finds lecture by ID
     * @param id - ID of the lecture
     * @return Lecture of searched lecture
     */
    Lecture findLectureById(Long id);

    /**
     * Finds all lectures
     * @return List of Lectures
     */
    List<Lecture> findAllLectures();

    /**
     * Finds lecture by its topic
     * @param topic - topic of the lecture
     * @return - Lecture of searchd lecture
     */
    Lecture findLectureByTopic(String topic);

    /**
     * Method to delete lecture
     * @param id - id of lecture that's going to be deleted
     */
    void deleteLecture(Long id);

    /**
     * Method to update lecture
     * @param lecture - lecture to be updated
     */
    void updateLecture(Lecture lecture);

    /**
     * Method to create lecture
     * @param lecture - lecture to be created
     */
    void createLecture(Lecture lecture);

}
