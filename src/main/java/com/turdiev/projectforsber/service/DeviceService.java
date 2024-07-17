package com.turdiev.projectforsber.service;

import com.turdiev.projectforsber.entity.Device;

import java.util.List;

/**
 * Интерфейс, представляющий сервис для работы с устройствами (Device).
 */
public interface DeviceService {

    /**
     * Получить список всех устройств.
     *
     * @return Список всех устройств.
     */
    public List<Device> getAllDevices();

    /**
     * Сохранить устройство.
     *
     * @param device Устройство для сохранения.
     */
    public void saveDevice(Device device);

    /**
     * Получить устройство по его идентификатору.
     *
     * @param id Идентификатор устройства.
     * @return Устройство с указанным идентификатором или null, если не найдено.
     */
    public Device getDeviceId(int id);

    /**
     * Удалить устройство по его идентификатору.
     *
     * @param id Идентификатор устройства.
     */
    public void deleteDevice(int id);

    /**
     * Найти устройства по имени.
     *
     * @param name Имя, по которому выполняется поиск устройств.
     * @return Список устройств с указанным именем.
     */
    public List<Device> findAllByName(String name);

    /**
     * Найти устройства по модели.
     *
     * @param model Модель, по которой выполняется поиск устройств.
     * @return Список устройств с указанной моделью.
     */
    public List<Device> findAllByModel(String model);

    /**
     * Найти устройства по цвету.
     *
     * @param color Цвет, по которому выполняется поиск устройств.
     * @return Список устройств с указанным цветом.
     */
    public List<Device> findAllByColor(String color);

    /**
     * Найти устройства по цене.
     *
     * @param price Цена, по которой выполняется поиск устройств.
     * @return Список устройств с указанной ценой.
     */
    public List<Device> findAllByPrice(int price);

    /**
     * Найти устройства по объему памяти.
     *
     * @param memory Объем памяти, по которому выполняется поиск устройств.
     * @return Список устройств с указанным объемом памяти.
     */
    public List<Device> findAllByMemory(String memory);
}
