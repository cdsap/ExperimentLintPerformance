package com.performance.module_2_134

class Feature134UseCase2(
    private val repository: Feature134Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
