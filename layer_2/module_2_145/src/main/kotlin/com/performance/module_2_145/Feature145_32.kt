package com.performance.module_2_145

class Feature145UseCase0(
    private val repository: Feature145Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
