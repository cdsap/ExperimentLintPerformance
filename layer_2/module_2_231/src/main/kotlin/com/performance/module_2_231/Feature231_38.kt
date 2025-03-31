package com.performance.module_2_231

class Feature231UseCase2(
    private val repository: Feature231Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
