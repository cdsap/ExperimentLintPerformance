package com.performance.module_4_191

class Feature191UseCase2(
    private val repository: Feature191Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
