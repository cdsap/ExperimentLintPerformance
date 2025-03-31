package com.performance.module_2_229

class Feature229UseCase1(
    private val repository: Feature229Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
