package com.fastoffer.backend.repositories;

        import com.fastoffer.backend.entities.QuestionEntity;
        import com.fastoffer.backend.entities.RedoEntity;
        import com.fastoffer.backend.entities.RedoQuestionEntity;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;

        import java.util.List;
        import java.util.Set;
        import java.util.UUID;

public interface RedoRepository extends JpaRepository <RedoQuestionEntity, UUID> {
    @Query(nativeQuery = true, value = "SELECT q.question_id , q.title, q.category  FROM " +
            "redo r LEFT JOIN question q ON r.redo_question_id = q.question_id WHERE r.redo_interviewee_id = :id")
    Set<RedoQuestionEntity> findQuestionIdByUserId(@Param("id") UUID id);

//    public boolean existsByIntervieweeAccountEntity(UUID account_id);
}
