package com.fastoffer.backend.repositories;

        import com.fastoffer.backend.entities.RedoEntity;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;

        import java.util.List;
        import java.util.UUID;

public interface RedoRepository extends JpaRepository <RedoEntity, UUID> {
    @Query(nativeQuery = true, value = "SELECT Cast(r.redo_question_id as varchar) redo_question_id , q.title, q.category  FROM " +
            "redo r LEFT JOIN question q ON r.redo_question_id = q.question_id WHERE r.redo_interviewee_id = :id")
    List<Object[]> findQuestionIdByUserId(@Param("id") UUID id);

//    public boolean existsByIntervieweeAccountEntity(UUID account_id);
}
