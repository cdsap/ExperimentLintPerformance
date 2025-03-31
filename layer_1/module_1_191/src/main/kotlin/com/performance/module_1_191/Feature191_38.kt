package com.performance.module_1_191

class Feature191UseCase2(
    private val repository: Feature191Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
