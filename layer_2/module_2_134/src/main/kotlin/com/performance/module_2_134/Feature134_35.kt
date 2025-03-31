package com.performance.module_2_134

class Feature134UseCase1(
    private val repository: Feature134Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
