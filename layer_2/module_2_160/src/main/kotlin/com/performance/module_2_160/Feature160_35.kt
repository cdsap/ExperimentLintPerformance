package com.performance.module_2_160

class Feature160UseCase1(
    private val repository: Feature160Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
