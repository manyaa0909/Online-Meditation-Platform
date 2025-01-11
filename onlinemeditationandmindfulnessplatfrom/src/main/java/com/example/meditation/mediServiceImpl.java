package com.example.meditation;

public class mediServiceImpl implements mediService {
    private final mediDao mediDao;

    public mediServiceImpl(mediDao changeMediDao) {
        this.mediDao = changeMediDao;
    }

    @Override
    public void save(medi changesMedi ) {
        mediDao.save(changesMedi);
    }
}
