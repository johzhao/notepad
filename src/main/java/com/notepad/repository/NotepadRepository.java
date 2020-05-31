package com.notepad.repository;

import com.notepad.model.Notepad;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jzhao
 */
@Repository
public interface NotepadRepository extends PagingAndSortingRepository<Notepad, Integer> {
}
