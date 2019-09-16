package com.retake.filmography.service;

import com.retake.filmography.dao.FilmDAOImpl;
import com.retake.filmography.dao.FilmDao;
import com.retake.filmography.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private FilmDao filmDAO;

    @Autowired
    public void setFilmDAO(FilmDao filmDAO) {
        this.filmDAO = filmDAO;
    }

    @Transactional
    public List<Film> allFilms() {
        return filmDAO.allFilms();
    }

    @Transactional
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Transactional
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Transactional
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Transactional
    public Film getById(int id) {
        return filmDAO.getById(id);
    }


}
