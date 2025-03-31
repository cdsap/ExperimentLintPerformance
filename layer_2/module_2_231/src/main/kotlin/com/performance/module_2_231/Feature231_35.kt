package com.performance.module_2_231

class Feature231UseCase1(
    private val repository: Feature231Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
