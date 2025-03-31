package com.performance.module_1_191

class Feature191UseCase0(
    private val repository: Feature191Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
