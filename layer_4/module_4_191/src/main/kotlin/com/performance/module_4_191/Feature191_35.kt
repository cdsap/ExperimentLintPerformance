package com.performance.module_4_191

class Feature191UseCase1(
    private val repository: Feature191Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
