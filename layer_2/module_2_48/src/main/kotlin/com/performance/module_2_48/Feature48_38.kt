package com.performance.module_2_48

class Feature48UseCase2(
    private val repository: Feature48Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
